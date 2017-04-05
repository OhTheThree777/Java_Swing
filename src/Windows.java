/**
 * Created by r958403448 on 2017/4/5.
 */
import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

/**
 *
 */
public class Windows extends JFrame implements ActionListener{

    GridBagLayout g=new GridBagLayout();
    GridBagConstraints c=new GridBagConstraints();
    Windows(String str) {
        super(str);
        setSize(300, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(g);
        addComponent();
        submit.addActionListener(this);
        setVisible(true);
        setLocationRelativeTo(null);
        setPopupMenu(this);
    }

    /**
     *
     * @param win
     */
    private void setPopupMenu(Windows win)
    {

        win.addMouseListener(new MouseInputAdapter()
        {

            @Override
            public void mouseReleased(MouseEvent e)
            {
                //                super.mousePressed(e);
                if (e.getButton() == MouseEvent.BUTTON3)
                {
                    JPopupMenu textMenu = new JPopupMenu();
                    JMenuItem close = new JMenuItem("关闭");
                    JMenuItem clean = new JMenuItem("清空");
                    textMenu.add(clean);
                    textMenu.add(close);
                    close.addActionListener(closeListener);
                    clean.addActionListener(cleanListener);
                    textMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }

        });

    }

    /**
     *
     */
    ActionListener cleanListener=new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
//            JCheckBox cou1,cou2,cou3,cou4,cou5,cou6,cou7,cou8;
//            JLabel noteInformation,studentNum;
//            JLabel sex,grade,profession,course;
//            JTextField studentName,textstudentNum;
//            JRadioButton sexMan,sexGirl;
//            JComboBox year,Pro;
//            JButton submit;
//            JTextArea result;
            cou1.setSelected(false);
            cou2.setSelected(false);
            cou3.setSelected(false);
            cou4.setSelected(false);
            cou5.setSelected(false);
            cou6.setSelected(false);
            cou7.setSelected(false);
            cou8.setSelected(false);
            studentName.setText("");
            textstudentNum.setText("");
            sexMan.setSelected(false);
            sexGirl.setSelected(false);
            year.setSelectedIndex(0);
            Pro.setSelectedIndex(0);
            result.setText("");

        }

    };

    /**
     *
     */
    ActionListener closeListener=new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            System.exit(0);
        }
    };


    /**
     *
     */
    public void addComponent(){
        noteInformation=new JLabel("姓名");
        add(g,c,noteInformation,0,1,1,1);

        studentName=new JTextField(10);
        add(g,c,studentName,1,1,2,1);

        studentNum=new JLabel("学号");
        add(g,c,studentNum,0,2,1,1);

        textstudentNum=new JTextField(10);
        add(g,c,textstudentNum,1,2,2,1);

        sex=new JLabel("性别");
        add(g,c,sex,0,3,1,1);

        sexMan=new JRadioButton("男");
        add(g,c,sexMan,1,3,1,1);
        sexGirl=new JRadioButton("女");
        add(g,c,sexGirl,2,3,1,1);
        ButtonGroup group=new ButtonGroup();
        group.add(sexMan);
        group.add(sexGirl);

        grade=new JLabel("年级");
        add(g,c,grade,0,4,1,1);

        String[] Year=new String[16];
        Year[0]="2000";
        Year[1]="2001";
        Year[2]="2002";
        Year[3]="2003";
        Year[4]="2004";
        Year[5]="2005";
        Year[6]="2006";
        Year[7]="2007";
        Year[8]="2008";
        Year[9]="2009";
        Year[10]="2010";
        Year[11]="2011";
        Year[12]="2012";
        Year[13]="2013";
        Year[14]="2014";
        Year[15]="2015";
        year=new JComboBox(Year);
        add(g,c,year,1,4,1,1);

        profession=new JLabel("专业");
        add(g,c,profession,0,5,1,1);
        String[] pro=new String[5];
        pro[0]="计算机科学与技术";
        pro[1]="通信技术";
        pro[2]="信息管理";
        pro[3]="软件工程";
        pro[4]="网络工程";
        Pro=new JComboBox(pro);
        add(g,c,Pro,1,5,1,1);

        course=new JLabel("课程");
        add(g,c,course,0,6,1,1);
        String[] cour=new String[8];
        cour[0]="程序设计基础";
        cour[1]="数据库原理";
        cour[2]="数据结构与算法";
        cour[3]="专业英语";
        cour[4]="操作系统";
        cour[5]="路由与交换技术";
        cour[6]="数字逻辑";
        cour[7]="高等数学";
        cou1=new JCheckBox(cour[1]);
        cou2=new JCheckBox(cour[0]);
        cou3=new JCheckBox(cour[2]);
        cou4=new JCheckBox(cour[3]);
        cou5=new JCheckBox(cour[4]);
        cou6=new JCheckBox(cour[5]);
        cou7=new JCheckBox(cour[6]);
        cou8=new JCheckBox(cour[7]);
        add(g,c,cou1,1,6,1,1);
        add(g,c,cou3,1,8,1,1);
        add(g,c,cou4,1,9,1,1);
        add(g,c,cou5,1,10,1,1);
        add(g,c,cou6,1,11,1,1);
        add(g,c,cou7,1,12,1,1);
        add(g,c,cou2,1,13,1,1);
        add(g,c,cou8,1,14,1,1);
//
        //TODO


        submit=new JButton("submit");
        c.insets=new Insets(7, 0, 4, 0);
        add(g,c,submit,1,15,1,1);
        result=new JTextArea(15,20);
        add(g,c,result,0,16,3,4);


    }

    /**
     *
     * @param g
     * @param c
     * @param jc
     * @param x
     * @param y
     * @param gw
     * @param gh
     */
    public void add(GridBagLayout g,GridBagConstraints c,JComponent jc,int x,int y,int gw,int gh){

        c.gridx=x;
        c.gridy=y;
        c.anchor=GridBagConstraints.WEST;
        c.gridwidth=gw;
        c.gridheight=gh;
        g.setConstraints(jc, c);
        add(jc);
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        new Windows("选课信息界面");
    }
    JCheckBox cou1,cou2,cou3,cou4,cou5,cou6,cou7,cou8;
    JLabel noteInformation,studentNum;
    JLabel sex,grade,profession,course;
    JTextField studentName,textstudentNum;
    JRadioButton sexMan,sexGirl;
    JComboBox year,Pro;
    JButton submit;
    JTextArea result;

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        String s=studentName.getText();
        String t=textstudentNum.getText();
        boolean m=sexMan.isSelected();
        String g=sexGirl.getText();
        String a=(String) year.getSelectedItem();
        String b=(String) Pro.getSelectedItem();
        String c=(cou1.isSelected()?cou1.getText()+"\n":"")
                +(cou2.isSelected()?cou2.getText()+"\n":"")
                +(cou3.isSelected()?cou3.getText()+"\n":"")
                +(cou4.isSelected()?cou4.getText()+"\n":"")
                +(cou5.isSelected()?cou5.getText()+"\n":"")
                +(cou6.isSelected()?cou6.getText()+"\n":"")
                +(cou7.isSelected()?cou7.getText()+"\n":"")
                +(cou8.isSelected()?cou8.getText()+"\n":"");
        String num="姓名："+s+"\n"+"学号: "+t+"\n 性别: "+(m==false?g:"男")+"\n"+"年级:"+a+"\n"+""+"专业 "+b+"\n课程"+c;
        result.setText(num);

    }

}

