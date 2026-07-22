import { Component, OnInit, OnDestroy } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-home',
  imports: [CommonModule, FormsModule],
  templateUrl: './home.html',
  styleUrl: './home.css'
})
export class Home implements OnInit, OnDestroy {

  // Interpolation
  portalName = 'Student Course Portal';

  // Property Binding
  isPortalActive = false;

  // Event Binding
  message = '';

  // Two-way Binding
  searchTerm = '';

  onEnrollClick() {
    this.message = 'Enrollment opened!';
  }

  // Lifecycle Hook
  ngOnInit(): void {
    console.log('✅ HomeComponent initialized - courses loaded');
  }

  // Lifecycle Hook
  ngOnDestroy(): void {
    console.log('❌ HomeComponent destroyed');
  }

}