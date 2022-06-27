import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LogosRSComponent } from './logos-rs.component';

describe('LogosRSComponent', () => {
  let component: LogosRSComponent;
  let fixture: ComponentFixture<LogosRSComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LogosRSComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LogosRSComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
