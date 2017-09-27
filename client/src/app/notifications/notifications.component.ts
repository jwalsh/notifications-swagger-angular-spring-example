import { Component, OnInit } from '@angular/core';
import { Http, Headers } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import { JsonPipe } from '@angular/common';

import { environment } from '../../environments/environment';
import { Configuration, DefaultApi, Task, Notification } from '../api';

@Component({
  selector: 'app-notifications',
  templateUrl: './notifications.component.html',
  styleUrls: ['./notifications.component.css']
})
export class NotificationsComponent implements OnInit {
  notifications$;
  notifications: Notification[];
  tasks$;
  tasks: Task[];

  constructor(public http: Http) {
    const basePath = environment.api_url;
    const headers = new Headers();
    headers.append('X-Auth-Token', '');
    const api = new DefaultApi(http, basePath, new Configuration());
    this.tasks$ = api.tasksGet({ headers });
  }

  ngOnInit() {
    this.tasks$.subscribe(data => {
      this.tasks = data;
      console.log(data);
    });

  }

}
