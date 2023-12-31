package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 

public class SignupTwo extends JFrame implements ActionListener {
    
    
    JTextField pan , aadhar;
    JButton next;
    JRadioButton s_yes,s_no,e_yes,e_no;
    JComboBox religion,category,income,occupation, education;
    String formno;
    
     SignupTwo(String formno){
         
         this.formno=formno;
         setLayout(null);
         
        setTitle("NEW ACCOUNT APPLICATION FORM -PAGE 2");
        
         
         
         
         JLabel additionalDetails=new JLabel("Page 2: Additional Details" );
         additionalDetails.setFont(new Font ("Raleway",Font.BOLD,22));
         additionalDetails.setBounds(290,80,400,30);
         add(additionalDetails);
         
         
         
         JLabel reli=new JLabel("Religion:" );
         reli.setFont(new Font ("Raleway",Font.BOLD,20));
         reli.setBounds(100,140,100,30);
         add(reli);
         
         String valReligion[]={"Hindu", "Muslim", "Sikh", "Christian"};
          religion=new JComboBox (valReligion);
         religion.setBounds(300,140,400,30);
         religion.setBackground(Color.WHITE);
         add(religion);
         
         
         JLabel cat=new JLabel("Category:" );
         cat.setFont(new Font ("Raleway",Font.BOLD,20));
         cat.setBounds(100,190,200,30);
         add(cat);
        
         String  valCategory[]={"General", "OBC", "SC", "ST"};
          category=new JComboBox(valCategory);
         category.setBounds(300,190,400,30);
         category.setBackground(Color.WHITE);
         add(category);
         
         JLabel dob=new JLabel("Income:" );
         dob.setFont(new Font ("Raleway",Font.BOLD,20));
         dob.setBounds(100,240,200,30);
         add(dob);
         
         String  incomeCategory[]={"Null", "< 1,50,000", "< 2,50,000", "< 5,00,000" ,"Upto 10,00,000"};
          income=new JComboBox(incomeCategory);
         income.setBounds(300,240,400,30);
         income.setBackground(Color.WHITE);
         add(income);
         
       
         
         JLabel gender=new JLabel("Educational" );
         gender.setFont(new Font ("Raleway",Font.BOLD,20));
         gender.setBounds(100,290,200,30);
         add(gender);
         
         JLabel email=new JLabel("Qualification:" );
         email.setFont(new Font ("Raleway",Font.BOLD,20));
         email.setBounds(100,315,200,30);
         add(email);
         
         String  educationValues[]={"Non-Graduation", "Graduation", "Post-Graduation", "Doctorate" ,"Others"};
          education=new JComboBox(educationValues);
         education.setBounds(300,315,400,30);
         education.setBackground(Color.WHITE);
         add(education);
        
         
         JLabel marital=new JLabel("Occupation:" );
         marital.setFont(new Font ("Raleway",Font.BOLD,20));
         marital.setBounds(100,390,200,30);
         add(marital);
         
         String  occupationValues[]={"Salaried", "Self-Employed", "Business", "Student" ,"Retired","Others"};
          occupation=new JComboBox(occupationValues);
         occupation.setBounds(300,390,400,30);
         occupation.setBackground(Color.WHITE);
         add(occupation);
         
          
         
         JLabel address=new JLabel("PAN No." );
         address.setFont(new Font ("Raleway",Font.BOLD,20));
         address.setBounds(100,440,200,30);
         add(address);
         
          pan = new JTextField();
         pan.setFont(new Font("Raleway",Font.BOLD,14));
         pan.setBounds(300,440,400,30);
         add(pan);
         
         JLabel city=new JLabel("Aadhar No.:" );
         city.setFont(new Font ("Raleway",Font.BOLD,20));
         city.setBounds(100,490,200,30);
         add(city);
         
          aadhar = new JTextField();
         aadhar.setFont(new Font("Raleway",Font.BOLD,14));
         aadhar.setBounds(300,490,400,30);
         add(aadhar);
         
         JLabel state=new JLabel("Senior Citizen:" );
         state.setFont(new Font ("Raleway",Font.BOLD,20));
         state.setBounds(100,540,200,30);
         add(state);
         
         s_yes=new JRadioButton("Yes");
         s_yes.setBounds(300,540,100,30);
         s_yes.setBackground(Color.white);
         add(s_yes);
         
          s_no=new JRadioButton("No");
         s_no.setBounds(450,540,100,30);
         s_no.setBackground(Color.white);
         add(s_no);
         
          
         
         ButtonGroup seniorgroup=new ButtonGroup();
         seniorgroup.add(s_yes);
         seniorgroup.add(s_no);
         
         
         JLabel pincode=new JLabel("Existing Account:" );
         pincode.setFont(new Font ("Raleway",Font.BOLD,20));
         pincode.setBounds(100,590,200,30);
         add(pincode);
         
         e_yes=new JRadioButton("Yes");
         e_yes.setBounds(300,590,100,30);
         e_yes.setBackground(Color.white);
         add(e_yes);
         
          e_no=new JRadioButton("No");
         e_no.setBounds(450,590,100,30);
         e_no.setBackground(Color.white);
         add(e_no);
         
         
         ButtonGroup existinggroup=new ButtonGroup();
         existinggroup.add(e_yes);
         existinggroup.add(e_no);
         
          next= new JButton("Next");
         next.setBackground(Color.BLACK);
         next.setForeground(Color.WHITE);
         next.setFont(new Font("Raleway",Font.BOLD,14));
         next.setBounds(620,660,80,30);
         next.addActionListener(this);
         add(next);
         
         getContentPane().setBackground(Color.WHITE);
         setSize(850,800);
         setLocation(350,10);
         setVisible(true);
     }
     
     public void actionPerformed(ActionEvent ae){
         String sreligion=(String)religion.getSelectedItem();   //  setText
         String scategory=(String)category.getSelectedItem();
         String sincome=(String)income.getSelectedItem();
         String seducation=(String)education.getSelectedItem();
         String soccupation=(String)occupation.getSelectedItem();
         
         
         String seniorCitizen= null;
         if(s_yes.isSelected()){
             seniorCitizen="Yes";
         } else if(s_no.isSelected()){
             seniorCitizen="No";
         }
         
         
      
         String existingaccount=null;
         if(e_yes.isSelected()){
             existingaccount="Yes";
         } else if(e_no.isSelected()){
             existingaccount="No";
         } 
         
         String span =pan.getText();
         String saadhar=aadhar.getText();
         
         
         try{
                 Con c= new Con();
                 String query="insert into signuptwo values('"+formno+"' , '"+sreligion+"' , '"+scategory+"' , '"+sincome+"', '"+seducation+"' , '"+soccupation+"' , '"+span+"'  , '"+saadhar+"'   , '"+seniorCitizen+"'   , '"+existingaccount+"' )";
                 c.s.executeUpdate(query);
                 
                 //Signup3 Object
                 setVisible(false);
                 new SignupThree(formno).setVisible(true);
             
         } catch(Exception e){
             System.out.println(e);
         }
     }
    
    public static void main(String args[]) {
        new SignupTwo("");
    }
}
