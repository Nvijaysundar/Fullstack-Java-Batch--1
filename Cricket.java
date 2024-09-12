class Cricket{
	public static void main(String args[])
	{
		int balls = 300, target_runs = 375, chasing_runs = 78 ,current_balls = 45;

		float overs_A =  balls/6 + (balls%6)*0.1f;
		float overs_B =  current_balls/6 + (current_balls%6)*0.1f;
		float curr_rr =  chasing_runs/overs_B;
		float total_rr = target_runs/overs_A;
		System.out.println("Overs_A : "+ overs_A);
		System.out.println("Overs_B : "+ overs_B);
		System.out.println("Curr_rr : "+ curr_rr);
		System.out.println("total_rr: "+ total_rr);
	} 

}
