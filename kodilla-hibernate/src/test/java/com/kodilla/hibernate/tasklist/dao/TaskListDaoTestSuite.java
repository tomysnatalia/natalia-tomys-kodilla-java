package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;

    private static final String LISTNAME = "Task list: ";
    private static final String DESCRIPTION_1 = "list with tasks to do";


    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList1 = new TaskList(LISTNAME, DESCRIPTION_1);
        taskListDao.save(taskList1);


        //When
        List<TaskList> checkTaskLists = taskListDao.findByListName(LISTNAME);

        //Then
        Assert.assertEquals(1,checkTaskLists.size());
        Assert.assertEquals(LISTNAME, checkTaskLists.get(0).getListName());


        //CleanUP
        taskListDao.delete(taskList1);




    }
}
