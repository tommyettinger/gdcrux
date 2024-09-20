# gdcrux
Extends libGDX types so they implement crux interfaces.

# What?

If you use libGDX and its math utilities, you will usually find yourself using Vector2 and/or Vector3. These are
mutable, float-based points in 2D and 3D respectively. You might also use GridPoint2 and GridPoint3, which are similar
but are int-based. If you at some point find you need to use some other library, such as
[SquidSquad](https://github.com/yellowstonegames/SquidSquad), you may find its point types are subtly different. That is
where [crux](https://github.com/tommyettinger/crux) comes in: it supplies several interfaces for points in 2D through
6D, as well as a parent superinterface that allows generalizing across all its point interfaces.

This library provides subclasses of the aforementioned libGDX point types, and makes those subclasses implement crux
interfaces.

That's all.

# License?
[Apache License 2.0](LICENSE).