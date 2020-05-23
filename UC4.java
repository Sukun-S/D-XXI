public class UC4{


	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	public static final int EMP_RATE_PER_HR=20;


	public static void main(String args[] ){
	System.out.println("Welcome");

	int	is_Present=1;
	int	empHrs=0;



            switch (attendence)
        {
                case IS_FULL_TIME:
                        empHrs=8;
                        break;
                case IS_PART_TIME:
                        empHrs=4;
                        break;
                default:
                        empHrs=0;
                                break;
        }
		empWage = (empHrs*EMP_RATE_PER_HR);
        System.out.println("Emp Wage Using Case  "+ empWage);







	}
}
