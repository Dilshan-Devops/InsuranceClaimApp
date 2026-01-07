# Insurance Claim App

A sample Android application built to demonstrate a basic implementation of Clean Architecture. The app displays a static list of insurance claims.

## Project Structure

The project is organized into three main layers (packages) as recommended by Clean Architecture:

```
app/src/main/java/lk/novatechnologies/insuranceclaimapp
├── data                # Manages data sources (local or remote)
│   ├── repository      # Implements the repository interfaces from the domain layer
│   └── source          # Contains data sources (e.g., network, database)
├── di                  # Dependency Injection setup using Hilt
├── domain              # Core business logic, independent of other layers
│   ├── model           # Defines the core data models (e.g., Claim)
│   ├── repository      # Defines interfaces for data access
│   └── usecase         # Encapsulates specific business rules
└── presentation        # UI Layer (Views, ViewModels)
    ├── adapter         # RecyclerView adapters
    ├── viewmodel       # ViewModels to hold and manage UI-related data
    └── MainActivity.kt   # The main view
```

## Built With

*   [Kotlin](https://kotlinlang.org/) - Official programming language for Android development.
*   [Clean Architecture](https://blog.cleancoder.com/uncle-bob/2012/08/13/the-clean-architecture.html) - The architectural pattern used.
*   [Hilt](https://developer.android.com/training/dependency-injection/hilt-android) - For dependency injection.
*   [Android Jetpack](https://developer.android.com/jetpack) - A suite of libraries to help developers follow best practices.
    *   [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - Stores UI-related data that isn't destroyed on UI changes.
    *   [ViewBinding](https://developer.android.com/topic/libraries/view-binding) - For safe and concise interaction with views.
*   [RecyclerView](https://developer.android.com/guide/topics/ui/layout/recyclerview) - For displaying lists of data efficiently.

## Getting Started

To get a local copy up and running, follow these simple steps.

### Prerequisites

*   Android Studio Iguana | 2023.2.1 or newer
*   JDK 17

### Setup and Installation

1.  **Clone the repository:**
    ```sh
    git clone https://github.com/your-username/InsuranceClaimApp.git
    ```

2.  **Open in Android Studio:**
    Open Android Studio, select `File > Open`, and navigate to the cloned project directory.

3.  **Gradle Sync:**
    Android Studio will automatically start a Gradle sync to download all the necessary dependencies. Wait for it to complete.

4.  **Run the App:**
    Once the sync is finished, you can build and run the app on an emulator or a physical device by clicking the `Run` button (▶) in Android Studio.

That's it! The app should now be running on your device/emulator.
