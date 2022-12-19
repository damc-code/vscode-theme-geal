
# TextPad

This theme was designed to be simple, it is based on color scheme of the old Textpad editor

## Syntax Palette

| Scope       | Color                                              | Scope   | Color              |
| ------------| -------------------------------------------------- | ------- | ------------------ |
| Background | ![#F7F7F7](https://via.placeholder.com/35/F7F7F7/?text=+) | Foreground | ![#000000](https://via.placeholder.com/35/000000/?text=+) |
| Comments | ![#008000](https://via.placeholder.com/35/008000/?text=+) | Keywords/Primitives | ![#1100FF](https://via.placeholder.com/35/1100FF/?text=+) |
| Brackets (Not Required) | ![#DC322F](https://via.placeholder.com/35/DC322F/?text=+) | Strings | ![#008080](https://via.placeholder.com/35/008080/?text=+) |
| Storage/Support | ![#0000AA](https://via.placeholder.com/35/0000AA/?text=+) | Constants | ![#AD4011](https://via.placeholder.com/35/AD4011/?text=+) |


## Preview
<p align="center">
<img  src="https://raw.githubusercontent.com/damc-code/damc.textpad-color-theme/main/images/screen.png"  
title="TextPad" />
</p>
Tested languages: Rust, Go, Python, Ruby, Java, Javascript, C#, C, C++, Typescript, PHP, Elixir, Groovy, Lua, Clojure, HTML

Do you want your editor looks like the previous image?
Follow these steps:

1. Disable the VSCode explorer options "Outline", "NPM Scripts"

2. Use these settings:

```js
{
    "editor.fontFamily": "MonoLisa, 'Courier New', Menlo, Monaco, 'Courier New', monospace",
    "editor.fontLigatures": true,
    "editor.occurrencesHighlight": false,
    "editor.selectionHighlight": false,
    "editor.matchBrackets": "never",
    "workbench.colorCustomizations": {
        "editorBracketHighlight.foreground1": "#ff0000",
        "editorBracketHighlight.foreground2": "#ff0000",
        "editorBracketHighlight.foreground3": "#ff0000",
        "editorBracketHighlight.foreground4": "#ff0000",
        "editorBracketHighlight.foreground5": "#ff0000",
        "editorBracketHighlight.foreground6": "#ff0000",
        "editorBracketHighlight.unexpectedBracket.foreground": "#ff0000",
    },
    "workbench.colorTheme": "textpad-classic-color-theme",
    "workbench.iconTheme": "textpad-icon-theme",
    "workbench.editor.tabCloseButton": "left",
    "workbench.editor.showIcons": false,
    "breadcrumbs.enabled": false,
}
```