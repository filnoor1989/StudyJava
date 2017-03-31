//калькулятор
public class Calculator {
	//reslut of calculate
	private int result;
	
	//summ of result method
	public void add(int ... params){
		for (Integer param:params){
			this.result +=param;
		}
	}
	
	//get resilt of calculate @return method
	public int getResult() {
		return this.result;
	}
	
	//clear result of calculation method
	public void cleanResult(){
		this.result = 0;
	} 
	
}