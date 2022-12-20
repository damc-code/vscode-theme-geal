
# Geal Theme

Geal was designed to be simple and clean, text color scheme was based on color scheme of the old Textpad editor

## Syntax Palette

| Scope       | Color                                              | Scope   | Color              |
| ------------| -------------------------------------------------- | ------- | ------------------ |
| Background | ![#FFFFFF](https://via.placeholder.com/35/F7F7F7/?text=+) | Foreground | ![#000000](https://via.placeholder.com/35/000000/?text=+) |
| Comments | ![#008000](https://via.placeholder.com/35/008000/?text=+) | Keywords/Primitives | ![#1100FF](https://via.placeholder.com/35/1100FF/?text=+) |
| Brackets (Not Required) | ![#DC322F](https://via.placeholder.com/35/DC322F/?text=+) | Strings | ![#008080](https://via.placeholder.com/35/008080/?text=+) |
| Storage/Support | ![#0000AA](https://via.placeholder.com/35/0000AA/?text=+) | Constants | ![#AD4011](https://via.placeholder.com/35/AD4011/?text=+) |


## Preview
<p align="center">
<img  src="https://raw.githubusercontent.com/damc-code/vscode-theme-geal/main/samples/screen_example.png"  
title="TextPad" />
</p>
Tested languages: Rust, Go, Python, Ruby, Java, Javascript, C#, C, C++, Typescript, PHP, Elixir, Groovy, Lua, Clojure, HTML

Do you want your editor looks like the previous image?
Follow these steps:

1. Disable the VSCode explorer options "Outline", "NPM Scripts"

2. Use these settings:

```js
{
    "editor.fontFamily": "IBMPlexMono",
    "editor.fontLigatures": true,
    "editor.occurrencesHighlight": false,
    "editor.selectionHighlight": false,
    "editor.matchBrackets": "never",
    "workbench.editor.tabCloseButton": "left",
    "workbench.editor.showIcons": false,
    "breadcrumbs.enabled": false,
}
```

# Icon theme
File icon themes for Visual Studio Code. Based on [unfancy-file-icons] package.

## Rules
-   Use a simple color code which works as follow:
    -   green for source files
    -   yellow for header, template, and stylesheet files
    -   violet for data files (`json`, `yml`, `csv`, etc)
    -   orange for scripts (`sh`, `bat`, `cmd`, etc)
    -   cyan for documentation files (`md`, `tex`, `pdf`, etc)
    -   blue for media files (images, videos, art software files, etc)
    -   magenta for ignore and lock files (`.gitignore`, `package-lock.json`, etc)
    -   gray for other files and directories
-   Use generic icons rather than trying to find one for each file extension