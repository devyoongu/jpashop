package jpabook.jpashop.domain.item;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QAlblum is a Querydsl query type for Alblum
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAlblum extends EntityPathBase<Alblum> {

    private static final long serialVersionUID = -1025549595L;

    public static final QAlblum alblum = new QAlblum("alblum");

    public final QItem _super = new QItem(this);

    public final StringPath artist = createString("artist");

    public final StringPath etc = createString("etc");

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final StringPath name = _super.name;

    //inherited
    public final NumberPath<Integer> price = _super.price;

    //inherited
    public final NumberPath<Integer> stockQuantity = _super.stockQuantity;

    public QAlblum(String variable) {
        super(Alblum.class, forVariable(variable));
    }

    public QAlblum(Path<? extends Alblum> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAlblum(PathMetadata metadata) {
        super(Alblum.class, metadata);
    }

}

