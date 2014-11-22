
package com.shxz.visitor;

public class VisitorA implements Visitor {
    /**
     * ��Ӧ��NodeA�ķ��ʲ���
     */
    @Override
    public void visit(NodeA node) {
        System.out.println(node.operationA());
    }
    /**
     * ��Ӧ��NodeB�ķ��ʲ���
     */
    @Override
    public void visit(NodeB node) {
        System.out.println(node.operationB());
    }

}