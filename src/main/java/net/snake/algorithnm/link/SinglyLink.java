package net.snake.algorithnm.link;

public class SinglyLink {

    private SinglyLinkNode head;

    public void appendNode(String nodeData){
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

    public String getNodeData(int index){
        if(head == null){
            return "";
        }else{
            int iCount = 0;
            SinglyLinkNode tmpNode = head;
            while((tmpNode = tmpNode.getNext()) != null && iCount < index-1){
                iCount ++;
            }

            return tmpNode.getNodeData();
        }
    }

    public void insertData(String data,int index){
        if(head == null){
            SinglyLinkNode node = new SinglyLinkNode();
            node.setNodeData(data);
        }else{
            int iCount = 0;
            SinglyLinkNode currentNode = head;
            SinglyLinkNode nextNode = head.getNext();
            SinglyLinkNode node = new SinglyLinkNode();
            node.setNodeData(data);
            while(nextNode != null && iCount < index-1){
                currentNode = nextNode;
                nextNode = currentNode.getNext();
                iCount ++;
            }
            if(nextNode != null){
                node.setNext(nextNode);
            }
            currentNode.setNext(node);
        }
    }

    public void del(int index){
        if(head != null){
            int iCount = 0;
            SinglyLinkNode currentNode = head;
            SinglyLinkNode previousNode = null;
            while(currentNode.getNext() != null && iCount < index-1){
                iCount ++;
                previousNode = currentNode;
                currentNode = currentNode.getNext();
            }
            if(previousNode != null){
                previousNode.setNext(currentNode.getNext());
            }else{
                head = currentNode.getNext();
            }
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
