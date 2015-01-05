package com.company.composite.section3;

import java.util.ArrayList;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 组装这个树形结构，并展示出来
 */
@SuppressWarnings("all") 
public class Client {

	public static void main(String[] args) {
		//首先是组装一个组织结构出来
		Branch ceo = compositeCorpTree();
		
		//首先把CEO的信息打印出来：
		System.out.println(ceo.getInfo());
		
		//然后是所有员工信息
		System.out.println(getTreeInfo(ceo));
	}
	
	//把整个树组装出来
	public static Branch compositeCorpTree(){
		//首先产生总经理CEO
		Branch root = new Branch("王大麻子","总经理",100000);
		//把三个部门经理产生出来
		Branch developDep = new Branch("刘大瘸子","研发部门经理",10000);
		Branch salesDep = new Branch("马二拐子","销售部门经理",20000);
		Branch financeDep = new Branch("赵三驼子","财务部经理",30000);
		
		//再把三个小组长产生出来
		Branch firstDevGroup = new Branch("杨三乜斜","开发一组组长",5000);
		Branch secondDevGroup = new Branch("吴大棒槌","开发二组组长",6000);
		
		//把所有的小兵都产生出来
		Leaf a = new Leaf("a","开发人员",2000);
		Leaf b = new Leaf("b","开发人员",2000);
		Leaf c = new Leaf("c","开发人员",2000);
		Leaf d = new Leaf("d","开发人员",2000);
		Leaf e = new Leaf("e","开发人员",2000);
		Leaf f = new Leaf("f","开发人员",2000);
		Leaf g = new Leaf("g","开发人员",2000);
		Leaf h = new Leaf("h","销售人员",5000);
		Leaf i = new Leaf("i","销售人员",4000);
		Leaf j = new Leaf("j","财务人员",5000);
		Leaf k = new Leaf("k","CEO秘书",8000);
		Leaf zhengLaoLiu = new Leaf("郑老六","研发部副经理",20000);
		
		//开始组装
		//CEO下有三个部门经理和一个秘书
		root.addSubordinate(k);
		root.addSubordinate(developDep);
		root.addSubordinate(salesDep);
		root.addSubordinate(financeDep);
		
		
		//研发部经理
		developDep.addSubordinate(zhengLaoLiu);
		developDep.addSubordinate(firstDevGroup);
		developDep.addSubordinate(secondDevGroup);
		
		
		
		//看看开发两个开发小组下有什么
		firstDevGroup.addSubordinate(a);
		firstDevGroup.addSubordinate(b);
		firstDevGroup.addSubordinate(c);
		secondDevGroup.addSubordinate(d);
		secondDevGroup.addSubordinate(e);
		secondDevGroup.addSubordinate(f);
		
		//再看销售部下的人员情况
		salesDep.addSubordinate(h);
		salesDep.addSubordinate(i);
		
		//最后一个财务
		financeDep.addSubordinate(j);
		
		return root;
	}
	
	//遍历整棵树,只要给我根节点，我就能遍历出所有的节点
	public static String getTreeInfo(Branch root){
		ArrayList<Corp> subordinateList = root.getSubordinate();
		String info = "";
		for(Corp s :subordinateList){
			if(s instanceof Leaf){ //是员工就直接获得信息
				info = info+ s.getInfo()+"\n";
			}else{ //是个小头目
				info = info +s.getInfo() +"\n"+ getTreeInfo((Branch)s);
			}
		}
		
		return info;
	}
	

}
