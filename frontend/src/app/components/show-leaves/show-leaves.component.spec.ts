import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowLeavesComponent } from './show-leaves.component';

describe('ShowLeavesComponent', () => {
  let component: ShowLeavesComponent;
  let fixture: ComponentFixture<ShowLeavesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ShowLeavesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ShowLeavesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
