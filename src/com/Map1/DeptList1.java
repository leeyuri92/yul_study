package com.Map1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DeptList1 extends JFrame implements ActionListener{
	// 선언부
	JPanel jp_north = new JPanel();
	JButton jbtn_sel = new JButton("조회");
	
	String header[] = {"부서번호", "부서명","지역"};
	String data[][] = new String[0][3];
	
	DefaultTableModel dtm = new DefaultTableModel(data,header);
	JTable jt = new JTable(dtm);
	JScrollPane jsp = new JScrollPane(jt);
	
	DeptVO init1(int deptno, String dname, String loc) {
		DeptVO dvo = new DeptVO();
		dvo.setDeptno(deptno);
		dvo.setDname(dname);
		dvo.setLoc(loc);
		return dvo;		
	}
	// 생성자
	
	// 메소드
	void initDisplay() {
		jp_north.setLayout(new FlowLayout(FlowLayout.LEFT));
		jbtn_sel.addActionListener(this);
		jp_north.add(jbtn_sel);
		this.add("North",jp_north);
		this.add("Center",jsp);
		this.setTitle("부서목록");
		this.setSize(600, 400);
		this.setVisible(true);		
	}
	
	
	DeptVO[] getDeptList1() {
		DeptVO[] dvos = new DeptVO[3];
		for(int i = 0; i<dvos.length;i++) {
			dvos[i] = init1((i+1)*10, "개발"+(i+1),"서울"+(i+1));			
		}
		return dvos;
	}
	
	void arrayPrint() {
		DeptVO[] dvos = getDeptList1();
		for(int i =0; i<dvos.length;i++) {
			Vector<Object> v = new Vector<Object>();
			v.add(dvos[i].getDeptno());
			v.add(dvos[i].getDname());
			v.add(dvos[i].getLoc());
			dtm.addRow(v);
			
		}
	}
	

	public static void main(String[] args) {
		DeptList1 dt = new DeptList1();
		dt.initDisplay();
		

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object obj = e.getSource();
		if(obj==jbtn_sel) {
			arrayPrint();
		}
		
	}

}
