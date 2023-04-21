package Week1.Day2.Project;

class JavaProjectSolution {
    public static void main(String[] args) {
        String email = "demo@email.com";
        String password = "123";
        String userEmail = "demo1@email.com";
        String userPassword = "234";
        if(email.equals(userEmail)){
            if(password.equals(userPassword)){
                System.out.println("Success");
            }else{
                System.out.println("Wrong Credentials");
            }
        }else{
            System.out.println("Wrong Credentials");
        }
    }
}