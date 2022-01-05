package com.alibaba.alink.operator.batch.tensorflow;

import com.alibaba.alink.common.AlinkGlobalConfiguration;
import com.alibaba.alink.common.dl.DLEnvConfig;
import com.alibaba.alink.common.dl.DLEnvConfig.Version;
import com.alibaba.alink.common.io.plugin.PluginDownloader;
import com.alibaba.alink.common.io.plugin.RegisterKey;
import com.alibaba.alink.common.utils.JsonConverter;
import com.alibaba.alink.operator.batch.BatchOperator;
import com.alibaba.alink.operator.batch.source.RandomTableSourceBatchOp;
import com.alibaba.alink.testutil.categories.DLTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.util.HashMap;
import java.util.Map;

public class TensorFlowBatchOpTest {

	@Category(DLTest.class)
	@Test
	public void test() throws Exception {
		AlinkGlobalConfiguration.setPrintProcessInfo(true);
		PluginDownloader pluginDownloader = AlinkGlobalConfiguration.getPluginDownloader();

		RegisterKey registerKey = DLEnvConfig.getRegisterKey(Version.TF115);
		pluginDownloader.downloadPlugin(registerKey.getName(), registerKey.getVersion());

		BatchOperator.setParallelism(3);

		BatchOperator <?> source = new RandomTableSourceBatchOp()
			.setNumRows(100L)
			.setNumCols(10);

		String[] colNames = source.getColNames();
		source = source.select("*, case when RAND() > 0.5 then 1. else 0. end as label");
		String label = "label";

		Map <String, Object> userParams = new HashMap <>();
		userParams.put("featureCols", JsonConverter.toJson(colNames));
		userParams.put("labelCol", label);
		userParams.put("batch_size", 16);
		userParams.put("num_epochs", 1);

		TensorFlowBatchOp tensorFlowBatchOp = new TensorFlowBatchOp()
			.setUserFiles(new String[] {"res:///tf_dnn_batch.py"})
			.setMainScriptFile("res:///tf_dnn_batch.py")
			.setUserParams(JsonConverter.toJson(userParams))
			.setNumWorkers(2)
			.setNumPSs(1)
			.setOutputSchemaStr("model_id long, model_info string")
			.linkFrom(source);
		tensorFlowBatchOp.print();
	}

	@Category(DLTest.class)
	@Test
	public void testWithAutoWorkersPSs() throws Exception {
		BatchOperator.setParallelism(3);

		BatchOperator <?> source = new RandomTableSourceBatchOp()
			.setNumRows(100L)
			.setNumCols(10);

		String[] colNames = source.getColNames();
		source = source.select("*, case when RAND() > 0.5 then 1. else 0. end as label");
		String label = "label";

		Map <String, Object> userParams = new HashMap <>();
		userParams.put("featureCols", JsonConverter.toJson(colNames));
		userParams.put("labelCol", label);
		userParams.put("batch_size", 16);
		userParams.put("num_epochs", 1);

		TensorFlowBatchOp tensorFlowBatchOp = new TensorFlowBatchOp()
			.setUserFiles(new String[] {"res:///tf_dnn_batch.py"})
			.setMainScriptFile("res:///tf_dnn_batch.py")
			.setUserParams(JsonConverter.toJson(userParams))
			.setOutputSchemaStr("model_id long, model_info string")
			.linkFrom(source);
		tensorFlowBatchOp.print();
	}
}