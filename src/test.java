import java.util.Properties;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Properties props = new Properties();
		// ����debug����
		props.setProperty("mail.debug", "true");
		// ���ͷ�������Ҫ�����֤
		props.setProperty("mail.smtp.auth", "true");//true��false����Ҫ��֤
		// �����ʼ�������������
		props.setProperty("mail.host", "smtp.163.com");
		// �����ʼ�Э������
		props.setProperty("mail.transport.protocol", "smtp");

		// ���û�����Ϣ
		Session session = Session.getInstance(props);

		// �����ʼ�����
		Message msg = new MimeMessage(session);
		try {
			msg.setSubject("JavaMail����");
		
		// �����ʼ�����
		msg.setText("����һ����JavaMail���͵��ʼ���");
		// ���÷�����
		msg.setFrom(new InternetAddress("long1314521yun@163.com"));

		Transport transport = session.getTransport();
		// �����ʼ�������
		transport.connect("smtp.163.com","long1314521yun", "yun3519740");//�����˻�������
		
		// �����ʼ�
		transport.sendMessage(msg, new Address[] { new InternetAddress("2536887754@qq.com") });//���Կ�緢��
		// �ر�����
		transport.close();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
