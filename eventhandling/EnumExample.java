class EnumExample{
	enum Weekdays{Mon,Tue,Wed,Thu,Fri,Sat}
	Weekdays days;
}
class EnumTest{
	public static void main(String args[]){
		EnumExample objEnum=new EnumExample();
		objEnum.days=EnumExample.Weekdays.Tue;
		System.out.println("day:"+objEnum.days);
	}
}
