import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class FrmEstadistica extends JFrame {
  
    //metodo constructor 
    public FrmEstadistica() {
        setSize(500,300);
        setTitle("Estadistica");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblDato=new JLabel("Dato");
        lblDato.setBounds(10,10,100,25);
        getContentPane().add(lblDato);

        JTextField txtDato = new JTextField();
        txtDato.setBounds(110,10,100,25);
        getContentPane().add(txtDato);

        JButton buttonAgg = new JButton("Agregar");
        buttonAgg.setBounds(110,40,100,25);
        getContentPane().add(buttonAgg);

        JButton buttonQuitar = new JButton("Quitar");
        buttonQuitar.setBounds(110,70,100,25);
        getContentPane().add(buttonQuitar);

        JLabel lblMuestra=new JLabel(" Muestra");
        lblMuestra.setBounds(220,10,100,25);
        lblMuestra.setHorizontalAlignment(SwingConstants.CENTER);
        getContentPane().add(lblMuestra);

        JList lstMuestra=new JList();
        JScrollPane spMuestra=new JScrollPane(lstMuestra);
        spMuestra.setBounds(220,40,100,150);
        getContentPane().add(spMuestra);


        JButton buttonEstd= new JButton("Estadistica");
        buttonEstd.setBounds(10,200,100,25);
        getContentPane().add(buttonEstd);


        JComboBox cmbEstadistica= new JComboBox();
        String[] opciones=new String[]{"Sumatoria ", "Promedio", "Desviacion Estandar", "Maximo", "Minimo", "Moda"};
        DefaultComboBoxModel dcm= new DefaultComboBoxModel(opciones);
        cmbEstadistica.setModel(dcm);
        cmbEstadistica.setBounds(110,200,100,25);
        getContentPane().add(cmbEstadistica);

        JTextField txtEstadsitica = new JTextField();
        txtEstadsitica.setBounds(220,200,100,25);
        txtEstadsitica.setEnabled(false);
        getContentPane().add(txtEstadsitica);
      
}
}
