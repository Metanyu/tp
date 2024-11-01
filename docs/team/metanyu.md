# Vu Nhat Nguyen Thu's Project Portfolio Page

## Project: MediTask

MediTask is a desktop application designed to help nurses efficiently manage and track their daily tasks via a Command Line Interface (CLI). This CLI tool streamlines task management, allowing nurses to quickly organize, monitor, and complete tasks, ensuring no important steps are missed.

---

Given below are my contributions to the project.

- **New Feature:** `task` packagae, including `Deadline`, `Repeat`, `Task`, `TaskList`, `Todo`.
    - **Description**: This package forms the core of the hospital task management system, providing data models and functionality for managing tasks. Key classes such as `Task`, `Deadline`, `Repeat`, and `Todo` allow for creating, organizing, and updating patient-related tasks. The `TaskList` class serves as a central hub to store and manage multiple tasks for each patient efficiently, including add, delete, marking, find, calculate completion rate of tasks.
    - **Scalability**: The class was designed with inheritance-based structure, new task types can easily extend the base `Task` class, allowing future additions without major rewrites. This extensible architecture supports new attributes and behaviors while ensuring maintainability.
    - **Highlights**: Implemented methods for adding, retrieving, deleting, marking a task. Robust error handling for multiple problems i.e missing task description, duplicate task, invalid command. The addition of new task types like `Todo`, `Deadline`, `Repeat` required extra attention, as it revised the entire parsing and task manipulation aspect of the program.
- **New Feature: Task Management Commands (`Command`, `CommandResult`,`AddTaskCommand`, `DeleteTaskCommand`, `ListTaskCommand`, `FindTaskCommand`, `MarkTaskCommand`, `UnmarkTaskCommand`)**
    - **Description**: Provides user commands to interact with the task system with task management functions like adding, deleting, finding, and updating tasks. Each command is defined within a dedicated command class that handles specific interactions, with `CommandResult` providing feedback on each action.
    - **Scalability**: Implemented using the Command Pattern, each command inherits from a base class, enabling new commands to be added independently. The structure also supports flexible responses via `CommandResult`, making future expansion easier.


- **Code contributed**: [Code Dashboard](https://nus-cs2113-ay2425s1.github.io/tp-dashboard/?search=metanyu&breakdown=true&sort=groupTitle%20dsc&sortWithin=title&since=2024-09-20&timeframe=commit&mergegroup=&groupSelect=groupByRepos&checkedFileTypes=docs~functional-code~test-code~other&tabOpen=true&tabType=authorship&tabAuthor=Metanyu&tabRepo=AY2425S1-CS2113-T11-1%2Ftp%5Bmaster%5D&authorshipIsMergeGroup=false&authorshipFileTypes=docs~functional-code~test-code&authorshipIsBinaryFileTypeChecked=false&authorshipIsIgnoredFilesChecked=false)
- **Project management**:
  - Participated in design discussions, contributing to project structure and feature planning.

- **Documentation**:
  - **Developer Guide**:
    - Added sequence diagrams and implementation details for `AddTask` commands ([PR #99](https://github.com/AY2425S1-CS2113-T11-1/tp/pull/99)) to show execution flow.
    - Included class diagrams and brief description for `Command`, `Task` classes ([PR #99](https://github.com/AY2425S1-CS2113-T11-1/tp/pull/99)), clarifying structure and relationships.
