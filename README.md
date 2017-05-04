# Tools


### GraphQL Model Generator 

```scala

//set main class in build.sbt 

mainClass in Compile := Some("sri.tools.graphqlmodels.Generator")

//install deps

yarn install or npm install

//place your schema.graphql in tools directory

sbt run 

//if everything goes fine you'll see generated  GraphQLModels.scala file in tools directory. 

```