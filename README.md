# 🎓 MKU Smart Student Portal

> **A next-generation intelligent Android client for the Mount Kenya University Student Portal.**

Unlike traditional student portal applications that depend on hardcoded screens and static layouts, this platform dynamically understands the authenticated student's portal, extracts information in real time, builds a semantic model of the student's academic environment, and automatically generates a premium adaptive dashboard.

---

# Vision

Transform the traditional web-based student portal into an AI-powered Android experience.

Instead of:

Login
↓

Open WebView
↓

Display Website

The platform performs:

Login
↓

Understand Portal
↓

Build Knowledge Graph
↓

Generate Student Context
↓

Create Adaptive Dashboard
↓

Render Native Android UI

No hardcoded dashboard.

No hardcoded widgets.

No manually designed student pages.

Everything is generated intelligently from the authenticated portal.

---

# Core Philosophy

The application is built around one principle:

> **The portal is the source of truth.**

The Android application never hardcodes:

- Student Name
- Registration Number
- Units
- Semester
- Fees
- Timetable
- Exams
- Results
- Notifications
- Widgets

Instead, the platform discovers these automatically after login.

---

# High-Level Architecture

```text
                    Android App
                          │
                          ▼
                 Authentication Engine
                          │
                          ▼
                  Portal Intelligence
                          │
                          ▼
             HTML Understanding Engine
                          │
                          ▼
                Semantic Knowledge Graph
                          │
                          ▼
             Student Context Generator
                          │
                          ▼
               Dashboard Blueprint AI
                          │
                          ▼
            Adaptive Dashboard Renderer
```

---

# Authentication Architecture

Authentication is treated as a transactional operation.

```text
User Login

↓

Login Page Discovery

↓

Hidden Field Extraction

↓

Credential Submission

↓

Cookie Capture

↓

Session Creation

↓

Portal Validation

↓

Authentication Complete

↓

Dashboard Generation
```

The authentication pipeline guarantees:

- Atomic transactions
- Cookie preservation
- Session integrity
- Automatic recovery
- Secure storage
- Dashboard launch

---

# Security

The platform includes enterprise-grade security.

## Features

- AES-256 Encryption
- Android Keystore
- HMAC Integrity
- Secure Session Store
- Certificate Validation
- Certificate Pinning
- HTTPS Only
- Session Recovery
- Cookie Encryption
- Runtime Validation

---

# Authentication Components

- Authentication Engine
- Login Orchestrator
- Session Manager
- Session Validator
- Session Recovery Manager
- Cookie Manager
- Cookie Synchronizer
- Portal Connector
- Crypto Manager
- Certificate Trust Manager

---

# Platform Bootstrap

The application starts using a dependency-driven bootstrap system.

```text
Android

↓

Hilt Dependency Graph

↓

Platform Bootstrap

↓

Dependency Graph

↓

Topological Sort

↓

Parallel Initialization

↓

Platform Verifier

↓

Authentication

↓

Portal Discovery

↓

Dashboard
```

---

# Intelligent Dashboard

The dashboard is never manually designed.

Instead:

Portal

↓

Extract HTML

↓

Understand Structure

↓

Generate Student Context

↓

Build Dashboard Blueprint

↓

Generate Layout

↓

Render Native Compose UI

Every student receives a personalized dashboard.

---

# Three-Layer Intelligence

## Layer 1

Portal Intelligence

Responsible for

- HTML Parsing
- DOM Understanding
- Navigation Discovery
- Form Detection
- Link Discovery
- Metadata Extraction

---

## Layer 2

Semantic Intelligence

Responsible for

- Student Knowledge Graph
- Academic Relationships
- Entity Recognition
- Context Building
- Intent Recognition

---

## Layer 3

Presentation Intelligence

Responsible for

- Adaptive Layout
- Widget Selection
- Theme Generation
- Motion Design
- Responsive Dashboard
- Native Compose Rendering

---

# Dynamic Rendering

No screen is hardcoded.

Example

Portal Data

↓

Student Name

↓

Student Context

↓

Widget Registry

↓

Dashboard Blueprint

↓

Compose Components

↓

Animated Dashboard

---

# Project Modules

## CORE

- Bootstrap
- Dependency Graph
- Lifecycle Manager
- Runtime Registry
- Health Monitor

## AUTH

- Authentication Engine
- Login Orchestrator
- Credential Manager

## SESSION

- Session Manager
- Session Validator
- Session Recovery

## COOKIE

- Cookie Manager
- Cookie Synchronizer

## NETWORK

- OkHttp
- Portal Transport
- Retry Policy
- TLS Validation

## SECURITY

- Crypto Manager
- Certificate Trust
- Secure Storage
- HMAC

## PORTAL

- Portal Discovery
- HTML Parser
- DOM Analyzer
- Portal Intelligence

## SEMANTIC

- Knowledge Graph
- Student Context
- Entity Extraction

## UI

- Dashboard Renderer
- Adaptive Layout
- Motion Engine
- Widget Generator

---

# Event Flow

```text
Application Start

↓

Platform Healthy

↓

Login Requested

↓

Authentication Started

↓

Portal Authenticated

↓

Session Created

↓

Knowledge Graph Generated

↓

Student Context Generated

↓

Dashboard Blueprint Generated

↓

Dashboard Rendered
```

---

# Technology Stack

## Language

- Kotlin

## UI

- Jetpack Compose
- Material Design 3

## Dependency Injection

- Hilt

## Networking

- OkHttp

## Security

- Android Keystore
- AES
- HMAC

## Concurrency

- Kotlin Coroutines
- Flow

---

# Design Principles

- Clean Architecture
- MVVM
- SOLID
- Dependency Injection
- Event Driven
- Modular Architecture
- Immutable State
- Single Source of Truth
- Atomic Authentication
- Runtime Validation

---

# Current Capabilities

✅ Secure Authentication

✅ Session Persistence

✅ Cookie Synchronization

✅ Certificate Validation

✅ Platform Bootstrap

✅ Dependency Graph

✅ Runtime Verification

✅ Portal Discovery

✅ HTML Understanding

✅ Knowledge Graph Generation

✅ Adaptive Dashboard Rendering

---

# Planned Enhancements

- AI Academic Assistant
- Predictive Academic Insights
- Smart Timetable Planner
- Attendance Analytics
- AI Fee Advisory
- Intelligent Notifications
- Offline Semantic Cache
- Cross-device Session Sync
- Voice Assistant
- Multi-language Support

---

# Project Goals

- Replace static portal interfaces with intelligent native experiences.
- Eliminate hardcoded dashboard layouts.
- Automatically adapt to authenticated portal content.
- Provide secure, scalable, and maintainable architecture.
- Deliver a premium Android experience for every student.

---

# License

This project is intended for educational and research purposes. Ensure compliance with Mount Kenya University's terms of service and privacy requirements before using it with production credentials.

---

# Authors

Developed as an intelligent Android platform focused on secure authentication, adaptive UI generation, and AI-driven portal understanding.
