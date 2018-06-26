package test.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import test.dao.EmpDao;
import test.dto.EmpDto;

/*
 *  emp 테이블과 dept 테이블을 이용한 프레임을 만들기
 *  
 *  JTable에 출력할 내용은
 *  
 *  사원번호 | 이름 | 급여 | 부서명 | 입사일 
 *  
 */
public class EmpFrame extends JFrame implements ActionListener{
	private DefaultTableModel model;
	public EmpFrame(){
		setLayout(new BorderLayout());
		String[] colNames= {"사원번호","이름","급여","부서명","입사일"};
		model=new DefaultTableModel(colNames, 0);
		JTable table=new JTable();
		table.setModel(model);
		
		JScrollPane scPane=new JScrollPane(table);
		//스크롤 페널을 프레임의 가운데에 배치 
		add(scPane, BorderLayout.CENTER);
		
		//패널을 만들고 
		JPanel northPanel=new JPanel();
		//버튼을 만들어서
		JButton testBtn=new JButton("테스트");
		//패널에 붙이고 
		northPanel.add(testBtn);
		//버튼이 붙은 패널을 프레임의 북쪽에 배치
		add(northPanel, BorderLayout.NORTH);
		//버튼의 리스너 등록
		testBtn.addActionListener(this);		
		
		
		setBounds(100, 100, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new EmpFrame();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		EmpDao dao=EmpDao.getInstance();
		List<EmpDto> list=dao.getList();
		for(EmpDto tmp:list) {
			Object[] data={tmp.getEmpno(),tmp.getEname(),tmp.getSal(),tmp.getDname(),tmp.getHiredate()};
			model.addRow(data);
		}		
	}
}
