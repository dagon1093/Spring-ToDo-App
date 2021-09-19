package org.springproject.todo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springproject.todo.model.Goal;
import org.springproject.todo.repository.GoalRepository;
import org.springproject.todo.service.GoalServiceImp;


@SpringBootApplication
public class TodoApplication {


	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);

		System.out.println("test");
//		GoalServiceImp serviceImp = new GoalServiceImp();
//
//		Goal goal = new Goal();
//		goal.setName("Cover the code with tests");
//
//		serviceImp.createGoal(goal);
	}

}
