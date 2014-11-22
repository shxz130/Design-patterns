package com.shxz.visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
    
    private List<Node> nodes = new ArrayList<Node>();
    /**
     * ִ�з�������
     */
    public void action(Visitor visitor){
        
        for(Node node : nodes)
        {
            node.accept(visitor);
        }
        
    }
    /**
     * ���һ����Ԫ��
     */
    public void add(Node node){
        nodes.add(node);
    }
    public static void main(String[] args) {
        //����һ���ṹ����
        ObjectStructure os = new ObjectStructure();
        //���ṹ����һ���ڵ�
        os.add(new NodeA());
        //���ṹ����һ���ڵ�
        os.add(new NodeB());
        //����һ��������
        Visitor visitor = new VisitorA();
        os.action(visitor);
    }
}