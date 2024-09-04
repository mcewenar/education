import { Component, OnInit } from '@angular/core';
import { Tarea } from 'src/app/models/task';

@Component({
  selector: 'app-tasks',
  templateUrl: './tasks.component.html',
  styleUrls: ['./tasks.component.css']
})
export class TasksComponent implements OnInit {
  taskList: Tarea[] = [];
  taskName = '';


  constructor() { }

  ngOnInit(): void {
  }

  addTask(): void {
    console.log(this.taskName);
    //1. Create task object
    const tarea: Tarea = {
      name: this.taskName,
      state: false
    }

    //2. Add object to array:
    this.taskList.push(tarea);


    //3. Reset form
    this.taskName = "";
  }
  //Void means that method don't return anything
  deleteTask(index: number): void {
    console.log(index);
    this.taskList.splice(index, 1); //JS method for delete a list element since its index. .slice(init, until)
  }

  updateTask(task: Tarea, index: number): void {
    this.taskList[index].state = true;
    //this.taskList[index].state = !task.state
    console.log(this.taskList[index].state)


  }

}
