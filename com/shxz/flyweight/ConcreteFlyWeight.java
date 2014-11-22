package com.shxz.flyweight;


	public class ConcreteFlyWeight implements FlyWeight {
	    private Character intrinsicState = null;
	    /**
	     * ���캯��������״̬��Ϊ��������
	     * @param state
	     */
	    public ConcreteFlyWeight(Character state){
	        this.intrinsicState = state;
	    }	    
	    /**
	     * ����״̬��Ϊ�������뷽���У��ı䷽������Ϊ��
	     * ���ǲ����ı���������״̬��
	     */
	    @Override
	    public void operation(String state) {
	        // TODO Auto-generated method stub
	        System.out.println("Intrinsic State = " + this.intrinsicState);
	        System.out.println("Extrinsic State = " + state);
	    }

	}

