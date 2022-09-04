<div align="center">
    <img src="assets/imgs/logo.png" alt="logo" width=150 height=150 />
</div>
<h1 align="center">ECharts Java</h1>
<p align="center">
    <em>"We bring better visualization into Java with ECharts"</em>
</p>
<p align="center">
    <a href="https://github.com/ECharts-Java/ECharts-Java/actions">
        <img src="https://github.com/ECharts-Java/ECharts-Java/actions/workflows/maven.yml/badge.svg" alt="Github Actions Status">
    </a>
    <a href="https://github.com/pyecharts/pyecharts/pulls">
        <img src="https://img.shields.io/badge/contributions-welcome-brightgreen.svg?style=flat" alt="Contributions welcome">
    </a>
    <!-- <a href="https://codecov.io/gh/ECharts-Java/ECharts-Java">
        <img src="https://codecov.io/gh/ECharts-Java/ECharts-Java/branch/dev/graph/badge.svg?token=V1N6AQ0EA1"/>
    </a> -->
    <a href="https://opensource.org/licenses/Apache-2.0">
        <img src="https://img.shields.io/badge/License-Apache_2.0-blue.svg" alt="License">
    </a>
    <a href="https://maven-badges.herokuapp.com/maven-central/org.icepear.echarts/echarts-java">
        <img src="https://maven-badges.herokuapp.com/maven-central/org.icepear.echarts/echarts-java/badge.svg" alt="Maven Central">
    </a>
</p>

[中文 README](README.zh.md)

[Official Documentation](https://echarts.icepear.org/#/)
## 📙 Introduction

ECharts Java is a lightweight but comprehensive library for Java developers to easily use JavaScript visualization library [Apache ECharts](https://echarts.apache.org/en/index.html). The simple chart mode facilitates users to write visualization fast and easily, empowered by the clean APIs provided by ECharts Java. The advanced mode helps create an `Option` object and its Json representation in chainable Java codes, which includes almost all the features defined in [Apache ECharts](https://echarts.apache.org/en/index.html). Now ECharts Java supports Apache ECharts version 5.x.

## 🌠 Features

- Simple, clean and organized APIs, supporting method chaining

- Full coverage of [Apache ECharts](https://echarts.apache.org/en/index.html) functionalities

- Easily integrate with Web Frameworks

- Flexible export format, including HTML and images

- Complete and detailed documentation and examples

## 🔬 Installation

For a Maven project, includes the following in your pom.xml
```xml
<dependency>
  <groupId>org.icepear.echarts</groupId>
  <artifactId>echarts-java</artifactId>
  <version>1.0.7</version>
</dependency>
```

For a Gradle Groovy project, includes
```
implementation 'org.icepear.echarts:echarts-java:1.0.7'
```

For more, refer to [here](https://search.maven.org/artifact/org.icepear.echarts/echarts-java/1.0.7/jar).

## 🔭 Usage

### Generate Local HTML and Download Image

```java
public static void main(String[] args) {
    // All methods in EChart Java supports method chaining
    Bar bar = new Bar()
              .setLegend()
              .setTooltip("item")
              .addXAxis(new String[] { "Matcha Latte", "Milk Tea", "Cheese Cocoa", "Walnut Brownie" })
              .addYAxis()
              .addSeries("2015", new Number[] { 43.3, 83.1, 86.4, 72.4 })
              .addSeries("2016", new Number[] { 85.8, 73.4, 65.2, 53.9 })
              .addSeries("2017", new Number[] { 93.7, 55.1, 82.5, 39.1 });
    Engine engine = new Engine();
    // The render method will generate our EChart into a HTML file saved locally in the current directory.
    // The name of the HTML can also be set by the first parameter of the function.
    engine.render("index.html", bar);
}
```
<img src="assets/imgs/multibar-render.gif" alt="multi-bar-render" style="width:85%;" />

### Generate Option Object and its JSON Representation

```java
public static void main(String[] args) {
    Line lineChart = new Line()
                .addXAxis(new CategoryAxis()
                        .setData(new String[] { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" })
                        .setBoundaryGap(false))
                .addYAxis()
                .addSeries(new LineSeries()
                        .setData(new Number[] { 820, 932, 901, 934, 1290, 1330, 1320 })
                        .setAreaStyle(new LineAreaStyle()));
    Engine engine = new Engine();
    // It is recommended that you can  get the serialized version of Option in the representation of JSON, which can be used directly in the template or in the RESTful APIs.
    String jsonStr = engine.renderJsonOption(lineChart);
}
```

The output JSON object will be like the following,

```json
{
  "xAxis": [
    {
      "type": "category",
      "data": ["Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"],
      "boundaryGap": false
    }
  ],
  "yAxis": [{ "type": "value" }],
  "series": [
    {
      "type": "line",
      "data": [820, 932, 901, 934, 1290, 1330, 1320],
      "areaStyle": {}
    }
  ]
}
```

### Integrate with Spring Web Application

<img src="assets/imgs/line-renderHtml.gif" alt="spring-boot-integration" style="width:75%;" />

For demo codes, please refer to the [docs](https://echarts.icepear.org/) and [example repo](https://github.com/incandescentxxc/ECharts-Java-Examples).

## 🎇 Gallery

<p float="center">
  <img src="assets/imgs/stacked-line.jpg" width="32%" />
  <img src="assets/imgs/stacked-area.jpg" width="32%" /> 
  <img src="assets/imgs/multiple-series-bar.jpg" width="32%" />
  <img src="assets/imgs/horizontal-stacked-bar.jpg" width="32%" /> 
  <img src="assets/imgs/basic-scatter.jpg" width="32%" />
  <!-- <img src="assets/imgs/basic-boxplot.jpg" width="32%" />  -->
  <img src="assets/imgs/basic-candlestick.jpg" width="32%" /> 
  <img src="assets/imgs/basic-heatmap.jpg" width="32%" /> 
  <img src="assets/imgs/basic-polar-line.jpg" width="32%" /> 
  <img src="assets/imgs/tangential-polar-bar.jpg" width="32%" /> 
  <img src="assets/imgs/basic-polar-scatter.jpg" width="32%" /> 
  <img src="assets/imgs/basic-radar.jpg" width="32%" /> 
  <img src="assets/imgs/basic-parallel.jpg" width="32%" />
  <img src="assets/imgs/basic-theme-river.jpg" width="32%" />
  <img src="assets/imgs/basic-rose.jpg" width="32%" />
  <img src="assets/imgs/nested-pie.jpg" width="32%" />
  <img src="assets/imgs/circular-layout-graph.jpg" width="32%" />
  <img src="assets/imgs/hide-overlapped-label-graph.jpg" width="32%" />
  <img src="assets/imgs/basic-sankey.jpg" width="32%" />
  <img src="assets/imgs/basic-funnel.jpg" width="32%" />
  <img src="assets/imgs/basic-sunburst.jpg" width="32%" />
  <img src="assets/imgs/animation-gauge.jpg" width="32%" /> 
</p>

## 💡 Authors
- [@IcePear-Jzx](https://github.com/IcePear-Jzx)
- [@incandescentxxc](https://github.com/incandescentxxc)

Welcome more contribution in the community!

## 💌 Acknowledgement
- This project is inspired by the Homework 6 of the course [Principles of Software Construction Objects, Design, and Concurrency](https://cmu-17-214.github.io/f2021/), Fall 2021, at [Carnegie Mellon University](https://www.cmu.edu/). We sincerely thank [Christian](https://www.cs.cmu.edu/~ckaestne/) and [Vincent](https://vhellendoorn.github.io/) for the wonderful course.

- This project is also inspired by the [pyecharts](https://github.com/pyecharts/pyecharts) and [go-echarts](https://github.com/go-echarts/go-echarts), which are the ECharts siblings in Python and Go languages.

## 🎈 License

ECharts Java is available under the [Apache License 2.0](LICENSE).
