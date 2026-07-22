import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CourseCard } from '../../components/course-card/course-card';

@Component({
  selector: 'app-course-list',
  imports: [CommonModule, CourseCard],   // <-- CourseCard MUST be here
  templateUrl: './course-list.html',
  styleUrl: './course-list.css'
})
export class CourseList implements OnInit {

  isLoading = true;
  selectedCourseId: number | null = null;

  courses = [
    { id: 1, name: 'Angular', code: 'ANG101', credits: 4, gradeStatus: 'passed' },
    { id: 2, name: 'Java', code: 'JAVA201', credits: 3, gradeStatus: 'pending' },
    { id: 3, name: 'Spring Boot', code: 'SB301', credits: 4, gradeStatus: 'failed' },
    { id: 4, name: 'Python', code: 'PY401', credits: 3, gradeStatus: 'passed' },
    { id: 5, name: 'SQL', code: 'SQL501', credits: 2, gradeStatus: 'pending' }
  ];

  ngOnInit(): void {
    setTimeout(() => {
      this.isLoading = false;
    }, 1500);
  }

  onEnroll(courseId: number): void {
    console.log(courseId);
    this.selectedCourseId = courseId;
  }
}