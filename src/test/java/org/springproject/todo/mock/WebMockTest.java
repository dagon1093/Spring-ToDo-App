package org.springproject.todo.mock;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springproject.todo.controller.GoalController;
import org.springproject.todo.service.GoalServiceImp;



@WebMvcTest(GoalController.class)
public class WebMockTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private GoalServiceImp serviceImp;


}
