import React, { useCallback, useRef } from "react";
import { DeleteOutlined } from "@ant-design/icons";
import { useClickAway } from "ahooks";
import { useObservableState } from "@/common/hooks/useObservableState";
import { Menu } from "@antv/x6-react-components";
import { useExperimentGraph } from "@/pages/rx-models/experiment-graph";
import { graphPointToOffsetPoint } from "@/pages/common//utils/graph";
import styles from "./index.less";

interface Props {
  experimentId: string;
  data: any;
}

export const NodeContextMenu: React.FC<Props> = (props) => {
  const { experimentId, data } = props;
  const containerRef = useRef<HTMLDivElement>(null as any);
  const expGraph = useExperimentGraph(experimentId);
  const [activeNodeInstance] = useObservableState(
    () => expGraph.activeNodeInstance$
  );

  useClickAway(() => {
    expGraph.clearContextMenuInfo();
  }, containerRef);

  const onNodeCopy = useCallback(async () => {
    await expGraph.onCopyNode(data.node);
  }, [expGraph, activeNodeInstance]);

  const onNodeDel = useCallback(async () => {
    console.warn(`data = ${JSON.stringify(data.node)}`);
    await expGraph.requestDeleteNodes([data.node.id]);
  }, [expGraph, activeNodeInstance]);

  const onGraphRun = useCallback(async () => {
    await expGraph.runGraph();
  }, [expGraph]);

  const { x: left, y: top } = graphPointToOffsetPoint(
    expGraph.graph!,
    data,
    expGraph.wrapper!
  );

  return (
    <div
      ref={containerRef}
      className={styles.graphContextMenu}
      style={{ top, left }}
    >
      <Menu hasIcon={true}>
        <Menu.Item onClick={onNodeDel} icon={<DeleteOutlined />} text="删除" />
        <Menu.Divider />
      </Menu>
    </div>
  );
};
