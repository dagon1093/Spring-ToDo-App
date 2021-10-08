package org.springproject.todo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springproject.todo.model.Goal;
import org.springproject.todo.repository.GoalRepository;
import org.springproject.todo.service.GoalServiceImp;


@SpringBootApplication
public class TodoApplication {


	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(TodoApplication.class, args);


		GoalServiceImp goalServiceImp = ctx.getBean(GoalServiceImp.class);

		Goal goal = new Goal();
		goal.setName("Cover the code with tests -------- 2 ----------");
		goalServiceImp.createGoal(goal);
//


	}

}
