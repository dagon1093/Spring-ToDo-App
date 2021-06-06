package org.springproject.todo.mock;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springproject.todo.controller.GoalController;
import org.springproject.todo.model.Goal;
import org.springproject.todo.service.GoalServiceImp;

import java.util.ArrayList;
import java.util.List;

//import static org.hamcrest.Matchers.containsString;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(GoalController.class)
public class WebMockTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private GoalServiceImp serviceImp;

    @Test
    public void getGoalsShouldReturnListOfGoals() throws Exception {
        Goal goal = new Goal();
        goal.setName("thenReturn");
        List<Goal> goals = new ArrayList<>();
        goals.add(goal);
        Mockito.when(serviceImp.getGoals()).thenReturn((ArrayList<Goal>) goals);
//        this.mockMvc.perform(get("/goals")).andDo(print()).andExpect(status().isOk())
//                .andExpect(content().string(containsString("Cover the code with tests")));
    }
}
