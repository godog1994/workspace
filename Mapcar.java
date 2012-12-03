import java.util.ArrayList;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Mapcar {

	/**
	 * @param args
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 * @throws NoSuchMethodException 
	 * @throws SecurityException 
	 */
	public static void main(String[] args) throws Exception 
	{
		Class[] parameterTypes = new Class[2];
		parameterTypes[0] = String.class;
		parameterTypes[1] = String.class;
        Method method1 = Mapcar.class.getMethod("concate", parameterTypes);
        
        
		ArrayList<String> testList = new ArrayList<String>();
		testList.add("a");
		testList.add("b");
		testList.add("c");
		testList.add("d");
		
		ArrayList<String> testList2 = new ArrayList<String>();
		testList2.add("a");
		testList2.add("b");
		testList2.add("c");
		testList2.add("d");
		
		Mapcar mc = new Mapcar();
		ArrayList resultList = Mapcar.mapcar(method1, mc, testList, testList2);
		for (int i = 0; i < resultList.size(); i++)
		{
			System.out.println(resultList.get(i));
		}
		
	}
	
	public String capitalize(String x)
	{
		return x.toUpperCase();
	}
	
	public String concate(String x, String y)
	{
		return x.concat(y);
	}
	
	public static ArrayList mapcar(Method method,Object object, ArrayList...lists) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException
	{
		ArrayList list = new ArrayList();
		System.out.println(lists.length);
		System.out.println(method);
		for ( int i = 0; i < lists[0].size(); i++)
		{
			Object[] parameters = new Object[lists.length];
			for (int y=0; y< lists.length; y++)
			{
				parameters[y]= lists[y].get(i);
			}
			
			list.add(method.invoke(object, parameters));
		}
		return list;
	}
	
	
	
}

