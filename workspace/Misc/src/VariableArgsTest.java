
public class VariableArgsTest {

	public static void main(String[] args) {
		
		test(1,2,2,2);
	}
	
	public static void test(Integer...type){
		StringBuilder queryBuilder = new StringBuilder();
        //queryBuilder.append("select * from snort_restart_event_config where");
        queryBuilder.append(" TYPE IN (");
        for (int i = 0; i < type.length; i++) {
            queryBuilder.append(type[i]);
            queryBuilder.append(",");
        }
        queryBuilder.replace(queryBuilder.length()-1, queryBuilder.length(), ")");
        System.out.println(queryBuilder.toString());
	}
}