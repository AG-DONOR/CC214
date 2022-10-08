import java.util.Stack;

public class ExamPPPiEM {

	public static void main(String[] args) {
		
		Stack<String> Exam = new Stack<String>();
		Exam.push("S");
		Exam.push("T");
		Exam.push("A");
		Exam.push("C");
		Exam.push("K");
		System.out.println("Display the contents: "+Exam);
		Exam.pop();
		Exam.pop();
		Exam.pop();
		System.out.println("Contents of Stack:"+Exam);
		System.out.println("Is Stack Empty? "+Exam.isEmpty());
		Exam.clear();
		System.out.println("Contents of Stacks: "+Exam);
		System.out.println("Is Stack Empty? "+Exam.isEmpty());
	}
}
