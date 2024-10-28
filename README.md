# gdcrux
Extends libGDX types so they implement crux interfaces.

# What?

If you use libGDX and its math utilities, you will usually find yourself using Vector2 and/or Vector3. These are
mutable, float-based points in 2D and 3D respectively. You might also use GridPoint2 and GridPoint3, which are similar
but are int-based. If you at some point find you need to use some other library, such as
[SquidSquad](https://github.com/yellowstonegames/SquidSquad), you may find its point types are subtly different. That is
where [crux](https://github.com/tommyettinger/crux) comes in: it supplies several interfaces for points in 2D through
6D, as well as a parent superinterface that allows generalizing across all its point interfaces. Every Point class
implements Json.Serializable (allowing serialization using libGDX Json) and Externalizable (allowing serialization using
the Apache Foundation's Fury library, as well as probably other libraries).

This library provides subclasses of the aforementioned libGDX point types, and makes those subclasses implement crux
interfaces. It also provides additions to libGDX Vector types (Vector5 and Vector6) for higher dimensions. These Vector
types are extended by the crux types PointF5 and PointF6. As support, there's PointMaker, to make creating points as
easy as calling `pt(1, 2, 3)`, and Distributor, which is used to produce normal-distributed variables (mostly used
internally, to set vectors to random directions in 5D and 6D). There's a GwtIncompatible annotation here, too; this
enables the Externalizable interface to be implemented by all Point classes here, without causing issues on GWT.

# Get?

The latest release should be available on Maven Central. Using Gradle:

```
api "com.github.tommyettinger:gdcrux:0.0.3"
```

On GWT with libGDX, you would also need this in your html module:
```
implementation "com.github.tommyettinger:crux:0.1.0:sources"
implementation "com.github.tommyettinger:gdcrux:0.0.3:sources"
```
and this in your GdxDefinition.gwt.xml file:
```xml
<inherits name="com.github.tommyettinger.gdcrux" />
```

# License?
[Apache License 2.0](LICENSE).