package functionalprogramming;

public interface GenericCalc<T> {
	public T compute(T num1, T num2, String operator);
}
