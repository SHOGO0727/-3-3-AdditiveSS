import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;

class AdditiveSS extends JFrame implements ActionListener{

    JLabel secret;
    JTextField secretIn;


    JLabel pict1;
    JLabel pict2;
    JLabel pict3;

    JLabel output;
    JTextField outputIn;

    public static void main(String[] args) {
      AdditiveSS frame = new AdditiveSS("title");
      frame.setVisible(true);
    }

    AdditiveSS(String title){
      setTitle("(3,3)加法的秘密分散"); //タイトル設定
      setVisible(true); //ウィンドウを表示する
      //frame.setBounds(250,100,800,500);
      setSize(800,500); //ウィンドウの大きさ(x,y)
      setLocationRelativeTo(null); //中央に表示
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //×を押したらアプリ終了
      ImageIcon icon = new ImageIcon("./ico/kao32.png"); //画像のロード
      setIconImage(icon.getImage()); //アイコン画像の設定

      JPanel header = new JPanel();
      //header.setPreferredSize(new Dimension(200, 200));
      header.setBackground(Color.ORANGE); //pの背景設定
      JLabel headerText = new JLabel("(3,3)秘密分散");
      headerText.setPreferredSize(new Dimension(400, 70));
      headerText.setFont(new Font("ＭＳ ゴシック", Font.PLAIN, 50));
      headerText.setHorizontalAlignment(JLabel.CENTER);
      headerText.setVerticalAlignment(JLabel.BOTTOM);
      //headerText.setBorder(new LineBorder(Color.black, 2, true));
      header.add(headerText);

      JPanel main = new JPanel();
      GridBagLayout layout = new GridBagLayout();
      main.setLayout(layout);
      GridBagConstraints gbc = new GridBagConstraints();

      header.setPreferredSize(new Dimension(400, 100));
      main.setBackground(Color.WHITE); //pの背景設定

      JButton distribute = new JButton("分散");
      distribute.addActionListener(this);
      gbc.gridx = 0;
      gbc.gridy = 0;
      layout.setConstraints(distribute, gbc);

      secret = new JLabel("　 秘密情報");
      secret.setPreferredSize(new Dimension(150, 50));
      secret.setFont(new Font("ＭＳ ゴシック", Font.PLAIN, 20));
      gbc.gridx = 1;
      gbc.gridy = 0;
      layout.setConstraints(secret, gbc);

      secretIn = new JTextField(20);
      secretIn.setPreferredSize(new Dimension(150, 50));
      secretIn.setFont(new Font("ＭＳ ゴシック", Font.PLAIN, 20));
      gbc.gridx = 2;
      gbc.gridy = 0;
      layout.setConstraints(secretIn, gbc);

      JButton clearSecret = new JButton("秘密情報クリア");
      clearSecret.addActionListener(this);
      gbc.gridx = 3;
      gbc.gridy = 0;
      layout.setConstraints(clearSecret, gbc);

      JButton reconstruct = new JButton("復元");
      reconstruct.addActionListener(this);
      gbc.gridx = 0;
      gbc.gridy = 1;
      layout.setConstraints(reconstruct, gbc);

      output = new JLabel("　 復元結果");
      output.setPreferredSize(new Dimension(150, 50));
      output.setFont(new Font("ＭＳ ゴシック", Font.PLAIN, 20));
      gbc.gridx = 1;
      gbc.gridy = 1;
      layout.setConstraints(output, gbc);

      outputIn = new JTextField(20);
      outputIn.setPreferredSize(new Dimension(150, 50));
      outputIn.setFont(new Font("ＭＳ ゴシック", Font.PLAIN, 20));
      gbc.gridx = 2;
      gbc.gridy = 1;
      layout.setConstraints(outputIn, gbc);

      JButton clearOutput = new JButton("復元結果クリア");
      clearOutput.addActionListener(this);
      gbc.gridx = 3;
      gbc.gridy = 1;
      layout.setConstraints(clearOutput, gbc);

      JLabel blank1 = new JLabel();
      blank1.setPreferredSize(new Dimension(300, 30));
      gbc.gridx = 0;
      gbc.gridy = 2;
      gbc.gridwidth = 4;
      layout.setConstraints(blank1, gbc);

      JButton clearAll = new JButton("オールクリア");
      clearAll.setPreferredSize(new Dimension(300, 30));
      clearAll.addActionListener(this);
      gbc.gridx = 0;
      gbc.gridy = 3;
      gbc.gridwidth = 4;
      layout.setConstraints(clearAll, gbc);
      clearAll.setHorizontalAlignment(JButton.CENTER); //ボタンの中の文字"クリア"の表示位置

      //addの順番で表示される
      main.add(distribute);
      main.add(secret); //pにlabelを追加
      main.add(secretIn);
      main.add(clearSecret);
      main.add(reconstruct);
      main.add(output);
      main.add(outputIn);
      main.add(clearOutput);
      main.add(blank1);
      main.add(clearAll);

      JPanel sub = new JPanel();
      sub.setPreferredSize(new Dimension(200, 130));
      sub.setBackground(Color.GREEN); //pの背景設定
      ImageIcon man = new ImageIcon("./man.png"); //画像のロード

      pict1 = new JLabel();
      pict1.setPreferredSize(new Dimension(200,100));
      pict1.setHorizontalAlignment(JLabel.RIGHT);
      pict1.setIcon(man);
      pict1.setBorder(new LineBorder(Color.black, 2, true));
      pict1.setHorizontalTextPosition(JLabel.LEFT);
      pict1.setVerticalTextPosition(JLabel.CENTER);
      pict1.setFont(new Font("ＭＳ ゴシック", Font.PLAIN, 20));
      sub.add(pict1);

      pict2 = new JLabel();
      pict2.setPreferredSize(new Dimension(200,100));
      pict2.setHorizontalAlignment(JLabel.RIGHT);
      pict2.setIcon(man);
      pict2.setBorder(new LineBorder(Color.black, 2, true));
      pict2.setHorizontalTextPosition(JLabel.LEFT);
      pict2.setVerticalTextPosition(JLabel.CENTER);
      pict2.setFont(new Font("ＭＳ ゴシック", Font.PLAIN, 20));
      sub.add(pict2);

      pict3 = new JLabel();
      pict3.setPreferredSize(new Dimension(200,100));
      pict3.setHorizontalAlignment(JLabel.RIGHT);
      pict3.setIcon(man);
      pict3.setBorder(new LineBorder(Color.black, 2, true));
      pict3.setHorizontalTextPosition(JLabel.LEFT);
      pict3.setVerticalTextPosition(JLabel.CENTER);
      pict3.setFont(new Font("ＭＳ ゴシック", Font.PLAIN, 20));
      sub.add(pict3);

/*
      JPanel footer = new JPanel();
      footer.setPreferredSize(new Dimension(200, 50));
      footer.setBackground(Color.YELLOW); //pの背景設定
      result = new JLabel();
      result.setFont(new Font("ＭＳ ゴシック", Font.PLAIN, 30));
      footer.add(result);
*/

      //labeln.setHorizontalAlignment(JLabel.LEFT);
      //labeln.setVerticalAlignment(JLabel.TOP);


      Container contentPane = getContentPane(); //ContentPaneを用意
      contentPane.add(header, BorderLayout.NORTH);
      contentPane.add(main, BorderLayout.CENTER); //ContentPaneにコンポーネントpを追加
      contentPane.add(sub, BorderLayout.SOUTH);
      //contentPane.add(result, BorderLayout.SOUTH);

    }
    public void actionPerformed(ActionEvent e){
      String input = secretIn.getText();
      int secret = 0;
      int p = 1000000007;
      String cmd = e.getActionCommand();
      if(cmd.equals("分散")){
        try{
          secret = Integer.parseInt(input);
          int a1 = (int)(Math.random()*(p-1));
          int a2 = (int)(Math.random()*(p-1));
          pict1.setText(String.valueOf(a1));
          pict2.setText(String.valueOf(a2));
          secret = secret - a1-a2 + p + p;
          secret %= p;
          pict3.setText(String.valueOf(secret));
        }
        catch(Exception ee){
          pict1.setText("エラー");
          pict2.setText("エラー");
          pict3.setText("エラー");
        }
      }
      else if(cmd.equals("復元")){
        try{
          int a1 = Integer.parseInt(pict1.getText());
          int a2 = Integer.parseInt(pict2.getText());
          int a3 = Integer.parseInt(pict3.getText());
          int ans = a1 + a2 + a3;
          ans %= p;
          outputIn.setText(String.valueOf(ans));
        }
        catch(Exception ee){
          outputIn.setText("エラー");
        }
      }
      else if(cmd.equals("オールクリア")){
        secretIn.setText("");
        outputIn.setText("");
        pict1.setText("");
        pict2.setText("");
        pict3.setText("");
      }
      else if(cmd.equals("秘密情報クリア")){
        secretIn.setText("");
      }
      else if(cmd.equals("復元結果クリア")){
        outputIn.setText("");
      }
    }

}
