public class BuilderPatternExample {
    private String id;
    private String name;
    private int age;
    private String describe;

    public static final class BuilderPatternExampleBuilder {
        private String id;
        private String name;
        private int age;
        private String describe;

        private BuilderPatternExampleBuilder() {
        }

        public static BuilderPatternExampleBuilder aBuilderPatternExample() {
            return new BuilderPatternExampleBuilder();
        }

        public BuilderPatternExampleBuilder withId(String id) {
            this.id = id;
            return this;
        }

        public BuilderPatternExampleBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public BuilderPatternExampleBuilder withAge(int age) {
            this.age = age;
            return this;
        }

        public BuilderPatternExampleBuilder withDescribe(String describe) {
            this.describe = describe;
            return this;
        }

        public BuilderPatternExample build() {
            BuilderPatternExample builderPatternExample = new BuilderPatternExample();
            builderPatternExample.name = this.name;
            builderPatternExample.id = this.id;
            builderPatternExample.age = this.age;
            builderPatternExample.describe = this.describe;
            return builderPatternExample;
        }
    }

    public static void main(String[] args) {
        BuilderPatternExample student=new BuilderPatternExampleBuilder().withId("1").withName("duy toan").withAge(21).build();
        BuilderPatternExample privateStudent=new BuilderPatternExampleBuilder().withId("1").withName("dong an").withAge(24).withDescribe("hoc qua gioi").build();
    }
}
