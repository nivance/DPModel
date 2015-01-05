package com.company.composite.section1;

import java.util.ArrayList;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * Client的作用是组装这棵树，并遍历一遍
 */
@SuppressWarnings("all")
public class Client {
	
	public static void main(String[] args) {
		//首先产生了一个跟节点
		IRoot ceo = new Root("王大麻子","总经理",100000);
		
		//产生三个部门经理，也就是树枝节点
		IBranch developDep = new Branch("刘大瘸子","研发部门经理",10000);
		IBranch salesDep = new Branch("马二拐子","销售部门经理",20000);
		IBranch financeDep = new Branch("赵三驼子","财务部经理",30000);
		
		//再把三个小组长产生出来
		IBranch firstDevGroup = new Branch("杨三乜斜","开发一组组长",5000);
		IBranch secondDevGroup = new Branch("吴大棒槌","开发二组组长",6000);
		
		//剩下的及时我们这些小兵了,就是路人甲，路人乙
		ILeaf a = new Leaf("a","开发人员",2000);
		ILeaf b = new Leaf("b","开发人员",2000);
		ILeaf c = new Leaf("c","开发人员",2000);
		ILeaf d = new Leaf("d","开发人员",2000);
		ILeaf e = new Leaf("e","开发人员",2000);
		ILeaf f = new Leaf("f","开发人员",2000);
		ILeaf g = new Leaf("g","开发人员",2000);
		ILeaf h = new Leaf("h","销售人员",5000);
		ILeaf i = new Leaf("i","销售人员",4000);
		ILeaf j = new Leaf("j","财务人员",5000);
		ILeaf k = new Leaf("k","CEO秘书",8000);
		ILeaf zhengLaoLiu = new Leaf("郑老六","研发部副总",20000);
		
		//该产生的人都产生出来了，然后我们怎么组装这棵树
		//首先是定义总经理下有三个部门经理
		ceo.add(developDep);
		ceo.add(salesDep);
		ceo.add(financeDep);
		//总经理下还有一个秘书
		ceo.add(k);
		
		//定义研发部门 下的结构
		developDep.add(firstDevGroup);
		developDep.add(secondDevGroup);
		//研发部经理下还有一个副总
		developDep.add(zhengLaoLiu);
		
		//看看开发两个开发小组下有什么
		firstDevGroup.add(a);
		firstDevGroup.add(b);
		firstDevGroup.add(c);
		secondDevGroup.add(d);
		secondDevGroup.add(e);
		secondDevGroup.add(f);
		
		//再看销售部下的人员情况
		salesDep.add(h);
		salesDep.add(i);
		
		//最后一个财务
		financeDep.add(j);
		
		//树状结构写完毕，然后我们打印出来
		System.out.println(ceo.getInfo());
	
		//打印出来整个树形
		getAllSubordinateInfo(ceo.getSubordinateInfo());
		
	}
	
	//遍历所有的树枝节点，打印出信息
	private static String getAllSubordinateInfo(ArrayList subordinateList){
		int length = subordinateList.size();
		for(int m=0;m<length;m++){  //定义一个ArrayList长度，不要在for循环中每次计算
			Object s = subordinateList.get(m);
			if(s instanceof Leaf){  //是个叶子节点，也就是员工
				ILeaf employee = (ILeaf)s;
				System.out.println(((Leaf) s).getInfo());
			}else{
				IBranch branch = (IBranch)s;
				System.out.println(branch.getInfo());
				//再递归调用
				getAllSubordinateInfo(branch.getSubordinateInfo());
			}
		}
		return null;
	}
}
