package org.springproject.todo;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springproject.todo.dto.GoalDTO;
import org.springproject.todo.service.GoalServiceImp;


@SpringBootApplication
public class TodoApplication {


	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(TodoApplication.class, args);


		GoalServiceImp goalServiceImp = ctx.getBean(GoalServiceImp.class);



		GoalDTO goal = new GoalDTO();
		goal.setName("Cover the code with tests -------- 2 ----------");
		goalServiceImp.createGoal(goal);


//


	}

}
