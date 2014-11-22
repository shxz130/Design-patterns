package com.shxz.visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
    
    private List<Node> nodes = new ArrayList<Node>();
    /**
     * 执行方法操作
     */
    public void action(Visitor visitor){
        
        for(Node node : nodes)
        {
            node.accept(visitor);
        }
        
    }
    /**
     * 添加一个新元素
     */
    public void add(Node node){
        nodes.add(node);
    }
    public static void main(String[] args) {
        //创建一个结构对象
        ObjectStructure os = new ObjectStructure();
        //给结构增加一个节点
        os.add(new NodeA());
        //给结构增加一个节点
        os.add(new NodeB());
        //创建一个访问者
        Visitor visitor = new VisitorA();
        os.action(visitor);
    }
}