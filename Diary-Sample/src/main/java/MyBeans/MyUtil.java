package MyBeans;

import java.lang.*;
import java.io.*;
import java.sql.*;
import java.text.*;
import java.util.*;
//import javax.mail.*;
//import javax.mail.internet.*;
//import javax.activation.*;


public class MyUtil {


		//8859_1�� KSC5601�� ��ȯ
	public String toKorean(String str) {
		String convStr = null;
		try {
			if(str == null)
				return "";

			convStr = new String(str.getBytes("8859_1"), "KSC5601");
		} catch (UnsupportedEncodingException e) {
		}

		return convStr;
	}
        //KSC5601�� 8859_1�� ��ȯ
	public String formKorean(String str) {
		String convStr = null;
		try {
			if (str == null)
				return "";
			convStr = new String(str.getBytes("KSC5601"), "8859_1");
		} catch (UnsupportedEncodingException e) {
		}

		return convStr;
	}

	// Null�� ""�� ��ȯ
	public String checkNull(String str) {
		String strTmp;
		if(str == null)
			strTmp = "";
		else
			strTmp = str;
		return strTmp;
	}

	// Null�� 0���� ��ȯ
	public String checkNull2(String str) {
		String strTmp;
		if(str == null)
			strTmp = "0";
		else
			strTmp = str;
		return strTmp;
	}

	// TextArea���� �Է¹��� ĳ���� ���ϰ��� <br>�±׷� ��ȯ
	public String n12br(String comment)
	{
		// �Ѿ�� ���� ���̸� ���մϴ�.
		int length = comment.length();
		StringBuffer buffer = new StringBuffer();

		//������ ���� ��ŭ �ݺ����� ���� �����ϴ�.
		for (int i =0; i<length; ++i)
		{
			//�ܾ �ϳ��� �߶� ������ �ֽ��ϴ�.
			String comp = comment.substring(i, i+1);
			if ("\r".compareTo(comp) == 0)
			{
				comp = comment.substring(++i, i+1);
				//���� ���Ϳ� �ش��ϴ� ���� ���� ��쿡�� <BR>�±׸�
				//�ƴ� ��쿡�� �׳� ���� ���ۿ� ����
				if ("\n".compareTo(comp) == 0)
					buffer.append("<BR>\r");
				else
					buffer.append("\r");
			}

			buffer.append(comp);
		}

		//������ ���� �ٽ� ���Ͻ�ŵ�ϴ�.
		return buffer.toString();
	}

}