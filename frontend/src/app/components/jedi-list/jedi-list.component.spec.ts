import { ComponentFixture, TestBed } from '@angular/core/testing';

import { JediListComponent } from './jedi-list.component';

describe('JediListComponent', () => {
  let component: JediListComponent;
  let fixture: ComponentFixture<JediListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [JediListComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(JediListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
