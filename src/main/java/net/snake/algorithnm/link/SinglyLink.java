package net.snake.algorithnm.link;

public class SinglyLink {

    private SinglyLinkNode head;

    public void addNode(String nodeData){
        SinglyLinkNode node = new SinglyLinkNode();
        node.setNodeData(nodeData);
        if(head == null){
            head = node;
        }else{
            SinglyLinkNode tmpNode = head;
            while(tmpNode.getNext() != null){
                tmpNode = tmpNode.getNext();
            }
            tmpNode.setNext(node);
        }
    }

    public String printLink(){
        StringBuffer stringBuffer = new StringBuffer();
        if(head == null){
            stringBuffer.append("Empty Link.");
        }else{

            SinglyLinkNode tmpNode = head;
            stringBuffer.append(tmpNode.getNodeData());
            stringBuffer.append(" ");
            while(tmpNode.getNext() != null){
                tmpNode = tmpNode.getNext();
                stringBuffer.append(tmpNode.getNodeData());
                stringBuffer.append(" ");
            }

        }
        return stringBuffer.toString();
    }

    public int getLinkSize(){
        if(head == null){
            return 0;
        }else{
            int tmpCount = 1;
            SinglyLinkNode tmpNode = head;
            while(tmpNode.getNext() != null){
                tmpNode = tmpNode.getNext();
                tmpCount++;
            }
            return tmpCount;
        }

    }
}
