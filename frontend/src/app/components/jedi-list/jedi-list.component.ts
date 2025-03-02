import { Component, OnInit } from '@angular/core';
import { JediService } from '../../services/jedi.service';
import { Jedi } from '../../models/jedi';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-jedi-list',
  imports: [CommonModule],
  templateUrl: './jedi-list.component.html',
  styleUrl: './jedi-list.component.css'
})
export class JediListComponent implements OnInit {

  jedis?: Jedi[];

  constructor(private jediService: JediService) { 
  }

  ngOnInit(): void {
    this.fetchJedis();
  }

  private fetchJedis() {
    this.jediService.findAll().subscribe({
      next: value => {
        this.jedis = value
        console.log(value)
      },
      error: error => {console.log(error)}
    })
  }

}
