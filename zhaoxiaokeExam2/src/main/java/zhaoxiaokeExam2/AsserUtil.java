package zhaoxiaokeExam2;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Map;


public class AsserUtil {
	
	
	
	//����1������Ϊ�棬���Ϊ�٣����׳��Զ����쳣���쳣��ϢΪ��2������Ĭ����Ϣ�� (5��)
	public static void isTrue(boolean condition, String message){
		if(!condition){
			throw new RunExcaption(message);
		}
	}
	
	//����2������Ϊ�٣����Ϊ�棬���׳��Զ����쳣���쳣��ϢΪ��2������Ĭ����Ϣ�� (5��)
	public static void isFalse(boolean condition, String message){
		if(condition){
			throw new RunExcaption(message);
		}
	}


	//����3�����Զ���Ϊ�գ����Ϊ�գ����׳��Զ����쳣���쳣��ϢΪ��2������Ĭ����Ϣ�� (5��)
	public static void notNull(Object obj, String message){
		if(obj==null||obj==""){
			throw new RunExcaption(message);
		}
	}

	//����4�����Զ������գ������Ϊ�գ����׳��Զ����쳣���쳣��ϢΪ��2������Ĭ����Ϣ�� (5��)
	public static void isNull(Object obj, String message){
		if(obj!=null){
			throw new RunExcaption(message);
		}
	}

	//����5�����Լ��ϲ�Ϊ�գ������ܿգ��Լ��������1��Ԫ�ء����Ϊ�գ����׳��Զ����쳣���쳣��ϢΪ��2������Ĭ����Ϣ�� (5��)
	public static void notEmpty(Collection<Object> coll, String message){
		if(coll==null || coll.size()==0){
			throw new RunExcaption(message);
		}
	}

	//����6������Map���ϲ�Ϊ�գ������ܿգ��Լ��������1��Ԫ�ء����Ϊ�գ����׳��Զ����쳣���쳣��ϢΪ��2������Ĭ����Ϣ�� (5��)
	public static void notEmpty(Map<Object,Object> map, String message){
		if(map==null || map.size()==0){
			throw new RunExcaption(message);
		}
	}

	//����7�������ַ���������ֵ��ȥ���ո�Ȼ���ж��ַ��������Ƿ����0�����ûֵ�����׳��Զ����쳣���쳣��ϢΪ��2������Ĭ����Ϣ�� (5��)
	public static void hasText(String condition, String message){
		String replace = condition.replace(" ", "");
		if(replace.length()==0||replace==null||replace==""){
			throw new RunExcaption(message);
		}
	}
	
	//����8������ֵ�������0�����С�ڻ����0�����׳��Զ����쳣���쳣��ϢΪ��2������Ĭ����Ϣ�� (5��)
	public static void greaterThanZero(BigDecimal value, String message){
		BigDecimal zore =new  BigDecimal("0");
		int i = value.compareTo(zore);
		if(i<1){
			throw new RunExcaption(message);
		}
		
	}


}
