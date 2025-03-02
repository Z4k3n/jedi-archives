import { Routes } from '@angular/router';
import { JediListComponent } from './components/jedi-list/jedi-list.component';

export const routes: Routes = [
    {path: '', redirectTo: 'jedis', pathMatch: 'full'},
    {path: 'jedis', component: JediListComponent}
];
